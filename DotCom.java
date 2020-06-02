import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells = new ArrayList<String>();
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String givenName) {
        name = givenName;
    }

    public String checkYourself(String userInput) {
        String result = "Miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Kill";

            } else {
                result = "Hit";
            }
        }

        return result;
    }

}