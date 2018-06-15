package streaming

object StreamApps {
  
  /*******************************************************************************************  
 
    Write a function createNaturalNumbersStream that creates an infinite Stream of 
    
    Natural Numbers starting with n. Use the function SimpleStream.createStreamGen for that task.
 
 *******************************************************************************************/
  
   def createNaturalNumbersStream(n:Int):SimpleStream[Int]= ???
     
  /*******************************************************************************************  
 
    Write a function createFibonacciStream that creates an infinite Stream of 
    
    Fibonacci Numbers. Use the function SimpleStream.createStreamGen for that task. 
 
 *******************************************************************************************/
      
   def createFibonacciStream:SimpleStream[BigInt]= ???  
 
 /*******************************************************************************************  
 
    Write a function createStreamOfStream that takes a Stream as input and generates a Stream  
    
    of Stream where each inner Stream consists of all elements of the previous Stream minus the
    
    head element, e.g.
    
    createStreamOfStreams(SimpleStream(1,2,3,4)) =>
    
    SimpleStream(SimpleStream(1,2,3,4),SimpleStream(2,3,4),SimpleStream(3,4),SimpleStream(4),
    SimpleStream(Empty).
    
 *******************************************************************************************/
   def createStreamOfStreams[T](s:SimpleStream[T]):SimpleStream[SimpleStream[T]]= ???
     
}