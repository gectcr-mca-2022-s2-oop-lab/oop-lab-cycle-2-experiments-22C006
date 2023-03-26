import java.util.*;

class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        // Strings inp= sc.nextLine();
        String value = sc.nextLine();

        System.out.println("String Length is : " + value.length());
        System.out.println("Enter String to concatenate: ");
        String s = sc.nextLine();
        System.out.println("String concatination : " + value.concat(s));

        System.out.println("Enter String to compare: ");
        String c = sc.nextLine();
        System.out.println("Compare To " + c + ":" + value.compareTo(c));

        System.out.println("Enter String to compare: ");
        String s1 = sc.nextLine();
        System.out.println("the 2 strings are equal? " + value.equals(s1));
        System.out.println("Enter String to replace: ");
        String s2 = sc.nextLine();
        System.out.println("Replace " + value + " with" + s2 + " words: " + value.replace(value, s2));
        System.out.println("Convert to LowerCase: " + value.toLowerCase());
        System.out.println("Convert to UpperCase: " + value.toUpperCase());

        System.out.println("Find index of:: ");
        String l = sc.nextLine();
        System.out.println("Index of character:" + l + ":" + value.indexOf(l));
        System.out.println("Enter position ");
        int i = sc.nextInt();
        System.out.println("Character at position 1: " + value.charAt(i));
    }

}