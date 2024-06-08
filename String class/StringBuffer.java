// public class StringBuffer {
   
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("rahul");
//         System.out.println(sb.capacity());// Stringbuffer length is already 16+ that means stringbuffer can store 16 character if character is more than 16 then it increase to 34
//
//     }
// }


// public class StringBuffer {
   
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer();
//         System.out.println(sb.capacity());

//         sb.append("hello");
//         System.out.println(sb.capacity());

//         sb.append("vigor java");
//         System.out.println(sb.capacity());//(old capacity(16)*2)+2 or (old capacity +1)*2
        
//     }
// }


// public class StringBuffer {
   
//     public static void main(String[] args) {
//         StringBuffer sb=new StringBuffer("pradosh");
//       System.out.println(sb.append("hello"));//append use to concatenate the value at the end of a first string
//         System.out.println(sb.charAt(3));//charAt use to print the character according to the index number provided by the user.
//         System.out.println(sb.delete(2,5));//delete is use to delete the character according to the index number(starting index,ending index) and print rest of the character
//         System.out.println(sb.deleteCharAt(3));//deleteCharAt is use to delete the character according to the index number and print rest of the character.

//     }
// }


public class StringBuffer {
   
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("pradosh");
        StringBuffer sb2=new StringBuffer("pradosh");
        System.out.println(sb.equals(sb2));//stringBuffer class does not override equals method of object class but string class override the equals method of object class.
        System.out.println(sb.indexOf("o"));//indexOf : use to search the character from starting  to ending and give his index value
        System.out.println(sb.lastIndexOf("o"));//;astIndexOf : use to search the character from ending to starting and give his index value
        System.out.println(sb.insert(3,"zzz"));//;insert(index value,"character") it is use to insert given character to a given index number.
        System.out.println(sb.replace(3,6,"m"));//;replace(start,end,"character") it is use to replace the character in given index value
        System.out.println(sb.reverse());//it reverse the characte
        System.out.println(sb.subSequence(3,6));//subSequence(start,end):it provide only index value character remove rest character.
        System.out.println(sb.substring(3,9));//It is used to return the substring from the specified beginIndex and endIndex.
        System.out.println(sb.ensureCapacity(100));//It is used to ensure the capacity at least equal to the given minimum.
        System.out.println(sb.setlength(4));//it use to set the maximum length .
        System.out.println(sb.trimtosize());//The trimToSize() method of Java StringBuffer class attempts to reduce the storage used for the character sequence
    }
}