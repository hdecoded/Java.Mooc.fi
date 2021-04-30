public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        // implement the creation of a magic square with the Siamese method algorithm here


        int row = 0;
        int column = (size - 1) / 2;
        int no = 1;
        int totatlNumber = size * size;
        boolean check = true;

        while (no <= totatlNumber) {

            square.placeValue(column, row, no);

            int pRow = row - 1;
            int pColumn = column + 1;

            if (pRow < 0) {
                pRow += size;
            }

            if (pColumn >= size) {
                pColumn %= size;
            }

            if (square.readValue(pColumn, pRow) == 0) {
                column = pColumn;
                row = pRow;
            } else {
                row++;
                if (column >= size) {
                    column = 0;
                }
            }
                no++;
            }
            return square;
        }
    }
