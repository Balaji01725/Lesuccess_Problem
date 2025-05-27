package Day4;

public class eventManagementCompanyTicketFormat {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("4523EF58G");

        System.out.println(generateTicket(str));
    }
    static String generateTicket(StringBuffer str){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='G'){
                    str.deleteCharAt(i);
                    i--;
                }if(str.charAt(i)=='E' && i!=str.length() && str.charAt(i+1)=='F'){
                        str.deleteCharAt(i);
                        str.deleteCharAt(i);
                        i-=2;
                    }
                }
        return str.toString();
        }

    }


