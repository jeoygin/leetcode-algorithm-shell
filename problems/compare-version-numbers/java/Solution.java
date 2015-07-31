public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("\\."), versions2 = version2.split("\\.");
        for (int i = 0; i < versions1.length || i < versions2.length; i++) {
            int v1 = i < versions1.length ? Integer.parseInt(versions1[i]) : 0;
            int v2 = i < versions2.length ? Integer.parseInt(versions2[i]) : 0;
            if (v1 != v2) {
                return v1 < v2 ? -1 : 1;
            }
        }
        return 0;
    }
}
