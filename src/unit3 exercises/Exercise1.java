package unit3;

public class Exercise1 {
    public void printOddUpTo(int x) {
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i + ",");
                }


            }


        }

    }


     public String getABCUpTo(char x){
        String word = "";
        char b = x;
        char ch;

        if (b >= 'a'&& b<= 'z'){
            for (ch = 'a'; ch<=x; ch++)
                System.out.println(ch);{
                    word +=ch;
            }
        }
        else if (b>= 'A'&& b<= 'Z'){
            for(ch = 'A'; ch<=x; ch++)
                System.out.println(ch);{
                    word += ch;
            }
        }

        else
            return null;
        return word;


        }


    }




