package freewind

import akka.actor.{Actor, ActorSystem, Props}

object ActorDemo extends App {
  val system = ActorSystem("ActorDemo")

  val localActor = system.actorOf(Props[LocalActor])
  localActor ! "Start"
}

class LocalActor extends Actor {
  val remote = context.actorSelection("akka://RemoteActorSystem@127.0.0.1:5150/user/RemoteActor")

  override def receive: Receive = {
    case "Start" => remote ! "Hello from LocalActor"
    case msg => println("*** LocalActor receives msg: " + msg)
  }
}
