public class CalculateAreas {

    static double[] func(Shape[] shapes) {
        double[] ans = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                ans[i] = shapes[i].area();
        }
        return ans;
    }
}
