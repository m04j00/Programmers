import java.util.ArrayList;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        ArrayList<String> visit = new ArrayList<String>();
        for (int i = 0; i < dirs.length(); i++) {
            int reX = x;
            int reY = y;
            char s = dirs.charAt(i);
            // System.out.println(s);
            if (s == 'U' && y < 5)
                y++;
            else if (s == 'D' && y > -5)
                y--;
            else if (s == 'R' && x < 5)
                x++;
            else if (s == 'L' && x > -5)
                x--;

            String xy = Integer.toString(x);
            xy += Integer.toString(y);
            String reXY = Integer.toString(reX);
            reXY += Integer.toString(reY);
            String st = xy + reXY;
            String nd = reXY + xy;

            // String xy = Integer.toString(x) + y;
            // String reXY = Integer.toString(reX) + reY;
            // String st = xy+reXY;
            // String nd = reXY + xy;

            // String st = x+""+y+""+reX+""+reY;
            // String ed = reX+""+reY+""+x+""+y;
            if (!visit.contains(st) && !visit.contains(nd) && !st.equals(nd)) {
                visit.add(st);
                visit.add(nd);
                // System.out.println(xy+reXY);
                // System.out.println(reXY + xy);
            }

        }
        // for(int i = 0; i < visit.size(); i++)
        // System.out.println(visit.get(i));
        answer = visit.size() / 2;
        return answer;
    }
}