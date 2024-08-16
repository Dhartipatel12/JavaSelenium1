package stringFunction;

public class StringPractice {


        public void stringFunction(){
            String obj = new String("Sumaia");

            char firstLetter = obj.charAt(0); //char starts with index, we print S here
            // System.out.println(firstLetter);

            int length = obj.length();
            // System.out.println(length); //length starts from 1

            String lower = obj.toLowerCase();
            //  System.out.println(lower);

            String upper = obj.toUpperCase();
            //  System.out.println(upper);

            String newspell = obj.replace("i", "y");
            // System.out.println(newspell);

            String addfullname = obj.concat("khanam");
            //  System.out.println(addfullname);

            String[] twonames = addfullname.split(" ");
            if (twonames.length >=1){
                System.out.println(twonames[0]);  //sumaia
                System.out.println(twonames[1]);  //khanam
            }
            else {
                System.out.println(" print full name");   //sumaia khanam
            }
            //   System.out.println(twonames[0]);
            //  System.out.println(twonames[1]);

        }

        public static void main(String[] args) {
            StringPractice obj = new StringPractice();
            obj.stringFunction();

        }

    }

