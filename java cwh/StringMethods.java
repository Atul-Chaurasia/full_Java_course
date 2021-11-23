class StringMethods
{
    public static void main(String[] args) 
    {
        String name = " Atul Chaurasia";
        
        System.out.println(name.length());          // length()

        String lCase = name.toLowerCase();          // toLowerCase()
        System.out.println(lCase);    

        String uCase = name.toUpperCase();          // toUpperCase()
        System.out.println(uCase);
        
        String str = name.trim();                   // trim()
        System.out.println(str); 


        System.out.println(name.substring(2,6));     // substring()

        System.out.println(name.replace('a','R'));    // replace('','')
        System.out.println(name.replace("s","aaa"));

        System.out.println(name.indexOf("Ch"));       // indexOf()
        System.out.println(name.indexOf("a",9));
        System.out.println(name.indexOf('t'));

        System.out.println(name.lastIndexOf("s"));
        
        System.out.println(name.charAt(1));           //charAt()

        System.out.println(name.startsWith(" "));     //startsWith()
        System.out.println(name.endsWith("a"));       // endsWith()


        String str2 = "Atul";                         // equals()
        System.out.println(str2.equals("atul"));      // equalsIgnoreCase()

        System.out.println(str2.equalsIgnoreCase("atul"));
    }
}