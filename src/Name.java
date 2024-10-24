public class Name {
    public static void main(String[] arhs)
    {
        String s="Arpitha AR";
        char[] s1=new char[4-0];
        s.getChars(0,4, s1,0);//getChars
        System.out.println(s.charAt(2));//charAt()
        System.out.println(s.toCharArray());//toCharArray()
        System.out.println(s.regionMatches(true,0,s,0,3));//regionMatches
        System.out.println(s.equals(s1));//equals
        System.out.println(s.equalsIgnoreCase(s1.toString()));//equalsIgnoreCase
        System.out.println(s.startsWith("A"));//startsWith
        System.out.println(s.endsWith("A"));//endsWith
        System.out.println(s.compareTo("Tarun"));//compareTo
        System.out.println(s.indexOf("pi"));//indexOf
        System.out.println(s.lastIndexOf("a"));//lastIndexOf
        System.out.println(s.substring(1));//substring
        System.out.println(s.substring(1,3));//substring
        System.out.println(s.concat("Z"));//concat
        System.out.println(s.replace('a','v'));//replace
        System.out.println(s.replace("Ar","vb"));//replace
        System.out.println(s.replaceAll("Ar","j"));//replaceAll
        System.out.println(s.replaceFirst("Ar","vv"));//replaceFirst
        System.out.println(" Hello ".trim());//trim()
        System.out.println(s.toLowerCase());//toLowerCase()
        System.out.println(s.toUpperCase());//toUpperCase()
        System.out.println(" vbvnv ".contains("b"));//contains()
        System.out.println("df".contentEquals("cv"));//contentEquals()
        System.out.println("vb".isEmpty());//isEmpty()
        String[] c="cv bb vbn nmm".split(" ");
        for(int i=0;i<c.length;i++)
        System.out.println(c[i]);//split()
        System.out.println("vbm jfkf".subSequence(2,5));//subSequence()
        StringBuffer p=new StringBuffer("Lol pi");
        System.out.println(p.length());
        System.out.println(p.capacity());
        System.out.println(p.indexOf(" "));
        System.out.println(p.append("lp"));
        System.out.println(p.append(9));
        System.out.println(p.deleteCharAt(3));
        System.out.println(p.delete(2,4));
        System.out.println(p.reverse());
        p.insert(2 ,"hjkl");
        System.out.println(p); p.setLength(66);System.out.println(p);



    }
}
