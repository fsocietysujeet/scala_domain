object ForAway{
     
     val code = {
         println("I'm about to create the subroutine")
         (isSunnayDay:Boolean,isRainyDay:Boolean) =>{
           //def result ={
            if(isSunnayDay)
                    "I'm happy because it's sunny"
              else if(isRainyDay)
                          "I'm sad because it's raining" 
              else
                     "Not sure how i feel about today"
           //}
         }
         
        }

        def code2(isSunnayDay:Boolean=true,isRainyDay:Boolean=false) : String =
            if(isSunnayDay)
                    "I'm happy because it's sunny"
              else if(isRainyDay)
                          "I'm sad because it's raining" 
              else
                     " Not sure how i feel about today"

        def code3(isSunnayDay:Boolean=true,isRainyDay:Boolean=false)  =
        {
            val x = 2
            val y = x+2
            x+2;
        }
         
       def f(x:Int):Int= x * x 
        
                   
}