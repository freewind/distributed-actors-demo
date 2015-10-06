Remote actors demo
====================

It has two projects, one is `local` and the other is `remote`.

Start:

- `freewind.RemoteActorDemo`
- `freewind.LocalActorDemo`

Problems:
---------

1. RemoteActor prints 'deadLetter'
------------------------------------------

The local actor can't send messages to remote actor, it prints in console:

```
### LocalActor started
[INFO] [10/05/2015 20:57:57.334] [ActorDemo-akka.actor.default-dispatcher-4] [akka://ActorDemo/deadLetters] 
Message [java.lang.String] from Actor[akka://ActorDemo/user/$a#-11944341] to Actor[akka://ActorDemo/deadLetters] 
was not delivered. [1] dead letters encountered. This logging can be turned off or adjusted with configuration 
settings 'akka.log-dead-letters' and 'akka.log-dead-letters-during-shutdown'.
```

Where is wrong?

Fixed
-----

http://stackoverflow.com/questions/32949490/where-is-wrong-in-my-remote-actor-demo/32951053#
