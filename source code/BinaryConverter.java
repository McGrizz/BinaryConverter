public class BinaryConverter {
  public static String decimalToBinary(int decimalNumber, byte wordSize){
      
           if(wordSize > 64) {
               return "ERROR: wordSize can be no larger than 64";
           }
           else if(wordSize <= 0) {
               return "ERROR: wordSize can be no less than 1";
           }
           
           // The variable binaryValue is initialized so characters
           // can be added to it later on.
           String binaryValue = "";
           
           // wordSize must be decremented or else the conversion will be
           // inaccurate for a reason I do not know.
           wordSize--;
           
           // Another variable must be initialized with the same value as
           // wordSize so we can perform mathematical calculations on that
           // value while still keeping the original value.
           byte exponent = wordSize;
           
           
           
           // ------------------------------------------------------------------
           // The logic within these border lines follows the process of
           // converting a given decimal number into binary.
           if(Math.pow(2, exponent) > decimalNumber){
                while(Math.pow(2, exponent) > decimalNumber){
                    
                    // The line below is used to add the extra zeros to
                    // binaryValue. Depending on the word size, there
                    // will be a number of preliminary zeros at the
                    // beginning of the binary value produced.
                    binaryValue += '0';
                    
                    exponent--;
                }
           }
           else if(Math.pow(2, exponent - 1) < decimalNumber){
               while(Math.pow(2, exponent - 1) < decimalNumber){
                   exponent++;
               }
           }
           
           
           int archNum = (int)Math.pow(2, exponent);
           
           while(archNum != 0){
               if(decimalNumber >= archNum){
                   decimalNumber -= archNum;
                   archNum /= 2;
                   binaryValue += '1';
               }

               else if(decimalNumber < archNum) {
                   archNum /= 2;
                   binaryValue += '0';
               }
                   
               }
           // ------------------------------------------------------------------
           
           return binaryValue;
           
           }
}