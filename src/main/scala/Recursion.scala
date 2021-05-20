object Recursion{

    def recursionInAction():Unit={


        //Recursion testing


             {
//                   def getCurrentSecond = java.time.LocalDateTime.now.getSecond()
//                   def getCurrentMinut = java.time.LocalDateTime.now.getMinute()
        def method:String ={
                var currenIteration = 1

               def loop: String = {
                     // val currentSecond = getCurrentSecond
                       if(currenIteration % 5 != 0){
                           println(currenIteration)
                           currenIteration += 1
                            loop
                       }
                       else
                               {
                             "done"
                               }
               }
                    loop
            }               
                
        def method2:String ={
//                var currenIteration = 1

               def loop(currenIteration:Int): String = {
                     // val currentSecond = getCurrentSecond
                       if(currenIteration % 5 != 0){
                           println(currenIteration)
                            loop(currenIteration+1)
                       }
                       else {
                            "done" 
                               }
               }
                    loop(1)

            }               
                 println(method2)
            //main method end

             }

    }



    
}