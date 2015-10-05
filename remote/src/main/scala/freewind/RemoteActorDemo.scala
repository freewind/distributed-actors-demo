package freewind

import akka.actor.{Actor, ActorSystem, Props}

object RemoteActorDemo extends App {
  val system = ActorSystem("RemoteActorSystem")
  val actor = system.actorOf(Props[RemoteActor], name = "RemoteActor")
  actor ! "Remote Actor is alive"
}

class RemoteActor extends Actor {
  override def receive: Receive = {
    case msg =>
      println("### RemoteActor received message: " + msg)
      sender ! "Hello from RemoteActor"
  }
}


