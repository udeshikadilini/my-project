public class ReverseString {

    public static void main(String[] args) {

       String stest= "Today is a day called Monday";

      // char[] chararray = stest.toCharArray();
       printReverseString(stest);

    }

//    static void printReverseString(String originalStr){
//        String words[] = originalStr.split(" ");
//        String reversedString = "";
//
//        //Reverse each word's position
//        for (int i = 0; i < words.length; i++) {
//            if (i == words.length - 1)
//                reversedString = words[i] + reversedString;
//            else
//                reversedString = " " + words[i] + reversedString;
//        }
//
//        // Displaying the string after reverse
//        System.out.print("Reversed string : " + reversedString);
//    }

    static void printReverseString(String originalStr){
        try{
            String words[] =originalStr.split(" ");
            StringBuilder reverse= new StringBuilder();
            for (int i= words.length-1; i>=0; i--){
                reverse.append(words[i]).append(" ");

            }
            System.out.println(reverse.toString());

        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
