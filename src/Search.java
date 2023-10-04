import java.util.ArrayList;

public class Search {

    public static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(value==array[i]){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i=0; i < list.size(); i++){
            if(string.equals(list.get(i))){
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value) {
        int l = 0;
        int r = array.length - 1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(value==array[m])
            {
                return m;
            }
            else if(value<array[m])
                r=m-1;
            else
                l=m+1;
        }
        return -1;

    }

    public static int binarySearch(String[] array, String string)
    {
        int l = 0;
        int r = array.length - 1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(string.equals(array[m]))
            {
                return m;
            }
            else if(string.compareTo(array[m])<0)
                r=m-1;
            else
                l=m+1;
        }
        return -1;
    }
}
