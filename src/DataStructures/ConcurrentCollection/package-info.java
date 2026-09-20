package DataStructures.ConcurrentCollection;
/*
* Concurrent Collections
Applications that use collections from more than one thread must be carefully programmed. In general, this is known as concurrent programming. The Java platform includes extensive support for concurrent programming. See Java Concurrency Utilities for details.
Collections are so frequently used that various concurrent friendly interfaces and implementations of collections are included in the APIs. These types go beyond the synchronization wrappers discussed previously to provide features that are frequently needed in concurrent programming.
These concurrent-aware interfaces are available:
BlockingQueue
TransferQueue
BlockingDeque
ConcurrentMap
ConcurrentNavigableMap
The following concurrent-aware implementation classes are available. See the API documentation for the correct usage of these implementations.
LinkedBlockingQueue
ArrayBlockingQueue
PriorityBlockingQueue
DelayQueue
SynchronousQueue
LinkedBlockingDeque
LinkedTransferQueue
CopyOnWriteArrayList
CopyOnWriteArraySet
ConcurrentSkipListSet
ConcurrentHashMap
ConcurrentSkipListMap*/