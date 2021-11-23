class PracticeSet3
{
    public static void main(String[] args) 
    {
        // Q1. convert string to lowercase.

        String str = "Hello World";
        System.out.println(str.toLowerCase());

        // Q2. replace spaces with underscore.

        String str2 = "Practice Set 3";
        System.out.println(str2.replace(" ","_"));

        // Q3. replace <|name|> with other name.

        String str3 = "Dear <|name|>, Thanks a lot";
        System.out.println(str3.replace("<|name|>","Atul"));

        // Q4. detect double or triple space

        String str4 = "  Hello !    EveryOne";
        System.out.println(str4.indexOf("   "));

        // Q5. format the string in letter using escape sequences.

        String str5 = "Dear Atul, \n\tThis Java Course is Nice. \n\t\t\tThanks !";
        System.out.println(str5);
    }
}