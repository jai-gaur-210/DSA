public class LargestNoFormedFromArray {

    String printLargest(String[] arr) {
        sort(arr, 0, arr.length - 1);
        String q = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            q = q + arr[i];
            // q.concat(arr[i]);
        }
        return q;
    }

    static void merge(String arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        String L[] = new String[n1];
        String R[] = new String[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            long c = 0;
            long d = 0;
            String a = L[i] + R[j];
            String b = R[j] + L[i];
            for (int p = 0; p < a.length(); p++) {
                if (Integer.parseInt(String.valueOf(a.charAt(p))) > Integer.parseInt(String.valueOf(b.charAt(p)))) {
                    c = 2;
                    d = 0;
                    break;
                } else if (Integer.parseInt(String.valueOf(a.charAt(p))) < Integer
                        .parseInt(String.valueOf(b.charAt(p)))) {
                    c = 0;
                    d = 2;
                    break;
                } else {
                    continue;
                }
            }

            if (c <= d) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(String arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {

        String arr[] = { "250", "74", "659", "931", "273", "545", "879", "924" };
        LargestNoFormedFromArray a = new LargestNoFormedFromArray();
        String ans = a.printLargest(arr);
        System.out.println(ans);
    }
}
