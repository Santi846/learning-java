//Exercise: "Given a string, return a new string where all vowels are converted to uppercase and all other alphabetical characters are converted to lowercase."
//Code...
//Start the Java Main Class
class Main {
    //function to determinate, if an element its on an array given
     static boolean isVowel(char c, char[] vowels) {
        c = Character.toLowerCase(c);
        for (char v : vowels) {
            if (c == v) return true;
        }
        return false;
    }

  //function for the process
    static void process(String str) {
        //1)define vowels to detect
        char[] vowels = {'a','e','i','o','u'};
        
        String result = "";

      //2) iterate over the string given, and treat it as an array for using its characters individually
            for(char c: str.toCharArray()){
              //3) if the character of the string as param passed, is a vowel, then
                if(isVowel(c,vowels)){
                        c = Character.toUpperCase(c);
                        System.out.println("Vowel detected: " + c);
                        result += c;
                        System.out.println("result Vowel detected: " + result);
                }
                //if not a vowel
                else{
                    c = Character.toLowerCase(c);
                    System.out.println("NOT vowel: " + c);
                    result += c;
                    System.out.println("result NOT Vowel : " + result);
                }
            }
      //show the state in action
       System.out.println("Original Word: " + str);
       System.out.println("End Word: " + result);
        
    }

  //initialize
    public static void main(String[] args){
        String word = "vowelcase";
        process(word);
    };
}
