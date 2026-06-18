

public class stringmethods {


    public static void main(String[] args) {

        String str = " Robotics And Automation ";

        System.out.println("Original String : " + str);//actual input

        System.out.println("Length          : " + str.length());//both = letter + spaces

        System.out.println("Character at 8  : " + str.charAt(8));//position of the specified charecter

        System.out.println("Upper Case      : " + str.toUpperCase());//changes eveything to uppercase letters

        System.out.println("Lower Case      : " + str.toLowerCase());//changes everything to lower case letters

        System.out.println("Trim            : " + str.trim());//removes the space in the starting and ending positions

        System.out.println("Contains And   : " + str.contains("And"));//to check wheather this wordsis there or not

        System.out.println("Index of m      : " + str.indexOf('m'));//to check the position of the char

        System.out.println("Replace Robotics   : "
                + str.replace("Robotics", "Industrial"));//to replace the words

        System.out.println("Substring       : "
                + str.substring(19, 24));//to pick a perticular word

        String s1 = "robo";
        String s2 = "robo";

        System.out.println("equals : "+ s1.equals(s2));//.equals-checks the reference points

        System.out.println("equalsIgnoreCase: "
                + s1.equalsIgnoreCase(s2));//it ignores the case ...the case might be upper or lower
    }
}

