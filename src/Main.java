public class Main {

        public static void main(String[] args) {

            Report report = new Report();

            Report row1 = new Report();
            row1.cells.add("a");
            row1.cells.add("b");
            row1.cells.add("c");
            report.setRows(row1.cells);



            Report row2 = new Report();
            row2.cells.add("d");
            row2.cells.add("e");
            row2.cells.add("f");
            report.setRows(row2.cells);;


            returnReport(row1);
            returnReport(row2);

        }

        static void returnReport(Row roww) {

            Report report1 = new Report();

            int i = 0;

            for (Object o : roww.cells) {
                o = roww.cells.get(i);
                report1.cells.add((String) o);
                i++;

            }

            System.out.println(report1.cells);

        }

    }

