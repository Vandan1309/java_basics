class lab1r {
    public static void main(String[] args) {
        
        //  equals() vs ==

        String s1 = new String("Vandan");
        String s2 = new String("Vandan");

        System.out.println("== vs equals():");
        System.out.println("s1 == s2 : " + (s1 == s2));          
        System.out.println("s1.equals(s2) : " + s1.equals(s2));  



        // 2. String vs StringBuffer

        System.out.println("\nString vs StringBuffer :");

       
        String s = "Tenali";
        s.concat("Rama");   
        System.out.println("String after concat: " + s);

        StringBuffer sb = new StringBuffer("Tenali");
        sb.append("Rama");   
        System.out.println("StringBuffer after append: " + sb); 
    }
}
