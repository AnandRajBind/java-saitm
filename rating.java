public class rating {
    
    public static void main(String[] args) {
        int rating = 3;

        switch(rating) {  //
            case 1:
                System.out.println("Very Bad Rating");
                break;
        
                case 2:
                System.out.println("Your  Rating is Two ");
                break;


                case 3:
                System.out.println("Your  Rating is Three");
                break;

                case 4:
                System.out.println("Your  Rating is four");
                break;

                case 5:
                System.out.println("Your  Rating is Five");
                break;

            default:
                System.out.println("Invalid Rating");
                break;
        }
    }
}
