import java.util.ArrayList;

public class HumanResource {
    private Association[] resources;
    private int count = 0;

    public void add(Association resource1) {
        if (resources == null)
            resources = new Association[1];
        else
            extend();

        resources[count] = resource1;
        count++;
    }

    public void delete(int token) {
        resources[token - 1] = null;
        Association[] temp = new Association[resources.length - 1];

        int x = 0;

        while (resources[x] != null) {
            temp[x] = resources[x];
            x++;
        }

        for (int j = x; j < temp.length; j++) {
            temp[j] = resources[j + 1];
        }
        resources = temp;

    }

    public String toString() {
        String res = "";

        for (int i = 0; i < resources.length; i++) {
            res += resources[i] + "\n";
        }

        return res;
    }

    private void extend() {
        Association[] assoc = new Association[count + 1];

        if (count > 0) {
            for (int i = 0; i < resources.length; i++) {
                assoc[i] = resources[i];
            }

            resources = assoc;
        }

    }
}
