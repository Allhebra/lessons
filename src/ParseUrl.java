/*Написано 04.11.17
 *автор Александр Береговой
 *выделение из URL'а имени сервера
 */

public class ParseUrl {

    public static void main(String[] args) {

        String url_1 = "http://SomeServerName/abcd/dfdf.htm?dfdf=dfdf";
        String url_2 = "http://SomeServerName";
        System.out.println(getServerName(url_1));
        System.out.println(getServerName(url_2));
    }

    private static String getServerName (String url) {

        int startIndex = url.indexOf("://") +3;
        if (url.indexOf("/", startIndex)!=-1) {
            return url.substring(startIndex, url.indexOf("/", startIndex));
        }
        else {
            return url.substring(startIndex);
        }
    }
}
