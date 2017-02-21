# SpreadSheet Project
## Specification
Your spreadsheet will consist of a 9 × 7 grid of cells, each displaying 12 characters maximum
(but could contain more). Rows are numbered 1–10. Columns are represented by the letters
A–G. Thus, cell C2 is the cell in the third column, second row.
1. Cells are assigned using “[cell] = [value]” commands. Cell is specified by ColRow (i.e
A3, C2). There are four different types of cell values: empty, text, numbers and
formulae, all specified in distinct ways.

2. Empty values don’t appear in the spreadsheet, and show the string “<empty>” when
individually queried. All cells begin as empty cells, and the “clear” command turns cells
into empty cells.

3. Text values are delimited (surrounded) by double quotes, but are displayed without
quotes.

  a. Examples include A1 = "hobnob"and F6 = "Augustus Gloop".
  
  b. If a string is larger than 12 characters, then within a cell it is truncated with “>”.
  For example, the string “01234567890123456789”would be displayed as
  “012345678901>”.

4. Numbered cells contain decimal numbers (stored as doubles). Real­valued examples
  include D3 = 1, A10 = 5.3, and F7 = 3.14159265358979.

5. Cells may also contain formulae. A formula is delimited by parentheses and spaces.
They include chains of the binary operators +, ­, / and *. Binary operators are
evaluated in strict left­to­right fashion.

  a. Examples of this sort include E2 = ( 1 + 1 ), ( 6 / 7 * 8 + 9 ), and
  the immensely pleasing ( 1 + 0.618 / 37 * 37 – 0 ).
  
  b. They may also reference other cells, such as ( A1 * C7 + D8 ).

6. A rectangular group of cells is designated by the top left cell, a dash, and then the
lower right cell.

  a. For example, top row would be represented by the string "A1­L1", the left
  column by "A1­A22", and the entire sheet by the string "A1­L22".

  7. In addition to binary operators, formulas may include the functions avg and sum.
  These will be specified as prefix operators that take a cell range as their single
  operand.
  
  a. Examples include "( avg B2­B5 )", and "( sum A1­D10 )".
  
  8. The spreadsheet will be displayed with row and column headings as shown below.
  
  a. Cells are separated with the character '|' and are all 12 characters long.
  
  b. Resulting cell values are displayed in each cell. If a value cannot be displayed
  completely, then display the truncated value with ">" (so only 11 characters of
  the value are shown). For example, the value 1.6180339887499 would be
  displayed as "1.618033988>".
 
  c. Rows are separated by ­­­­­­­­­­­­+between each cell (see below)
  
  ![screen shot 2017-02-21 at 12 47 44 pm](https://cloud.githubusercontent.com/assets/11382116/23184269/01167a90-f834-11e6- 98aa-ad3b45c09f1d.png)
    
  Here are some screen shots.
  
  ![screen shot 2017-02-21 at 12 47 44 pm](https://cloud.githubusercontent.com/assets/11382116/23184478/cded52dc-f834-11e6-8f54-47419e572a9a.png)

  ![screen shot 2017-02-21 at 12 52 48 pm](https://cloud.githubusercontent.com/assets/11382116/23184475/cdc31468-f834-11e6-9a7a-ea960b342823.png)

  ![screen shot 2017-02-21 at 12 52 25 pm](https://cloud.githubusercontent.com/assets/11382116/23184476/cdd26940-f834-11e6-9f8e-093221e6bfc1.png)

  ![screen shot 2017-02-21 at 12 53 13 pm](https://cloud.githubusercontent.com/assets/11382116/23184477/cdd947ba-f834-11e6-931e-6fda63d34168.png)
