public class PrintUnique {
    

    public static void main(String[] args) {
        
        int [] myArr = {5,5,5,6,6,6,7,29,29,45,45};

        for(int i=0; i<myArr.length-1; i++){
            if(myArr[i] != myArr[i+1]){
                System.out.println(myArr[i]);
            }
        }
        System.out.println(myArr[myArr.length-1]);
        UniqueChar();
    }
    public static void UniqueChar(){

        String str = "aabccdee";
        String uniques = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                uniques += ch; 
            }
        }
        System.out.println(uniques);
    }

}
