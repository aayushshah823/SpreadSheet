# SpreadSheet Project. 

I have created this project based on the specification I used.
 	My spreadsheet will consist of a 9 × 7 grid of cells, each displaying 12 characters maximum
(but could contain more). There are four different types of cell values: empty, text, numbers and
formulae, all specified in distinct ways.
	Empty values don’t appear in the spreadsheet, and show the string “<empty>” when
individually queried. All cells begin as empty cells, and the “clear” command turns cells
into empty cells.
	Text values are delimited (surrounded) by double quotes, but are displayed without
quotes.
		a. Examples include A1 = "hobnob" and F6 = "Augustus Gloop".
		b. If a string is larger than 12 characters, then within a cell it is truncated with “>”.
		   For example, the string “01234567890123456789” would be displayed as
		   “012345678901>”.
	Numbered cells contain decimal numbers (stored as doubles). Realvalued
examples
include D3 = 1, A10 = 5.3, and F7 = 3.14159265358979.
5. Cells may also contain formulae. A formula is delimited by parentheses and spaces.
They include chains of the binary operators +, ,
/ and *. Binary operators are
evaluated in strict lefttoright
fashion.
a. Examples of this sort include E2 = ( 1 + 1 ), ( 6 / 7 * 8 + 9 ), and
the immensely pleasing ( 1 + 0.618 / 37 * 37 – 0 ).
b. They may also reference other cells, such as ( A1 * C7 + D8 ).
6. A rectangular group of cells is designated by the top left cell, a dash, and then the
lower right cell.
a. For example, top row would be represented by the string "A1L1",
the left
column by "A1A22",
and the entire sheet by the string "A1L22".
7. In addition to binary operators, formulas may include the functions avg and sum.
These will be specified as prefix operators that take a cell range as their single
operand.
