//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tudelft.ghappy;

public class GHappy {
    public GHappy() {
    }

    public boolean gHappy(String str) {
        assert str != null;

        for(int i = 0; i < str.length(); ++i) {
            if (str.contains("g")==false ||((str.charAt(i) == 'g' && (i < 0 || str.charAt(i - 1) != 'g') && (i + 1 >= str.length() || str.charAt(i + 1) != 'g')))) {
                return false;
            }
        }

        return true;
    }
}
