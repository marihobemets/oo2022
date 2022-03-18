package isikukood;
//parem klõps -> generate -> constructor -> ok

public class IsikukoodEE implements IsikukoodObject{
    String isikukood;
    String [] kuud = {"jaanuar", "veebruar", "märts", "aprill", "mai", "juuni","juuli","august","september","oktoober","november","detsember"};
    //39402431256;

    public IsikukoodEE(String isikukood) {
        this.isikukood = isikukood;
    }

    @Override
    public boolean isMale() {
        return isikukood.startsWith("1") ||
                isikukood.startsWith("3") ||
                    isikukood.startsWith("5");
    }

    @Override
    public int getBirthYear() {
        return 1900 + Integer.parseInt(isikukood.substring(1,3));
    }

    @Override
    public String getBirthMonth() {
        return kuud[Integer.parseInt(this.isikukood.substring(3,5))-1];
    }
}
