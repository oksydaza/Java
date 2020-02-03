package pl.edu.agh.mwo.java;

import org.apache.poi.ss.usermodel.Workbook;

public class App {
	
	
	
    public static void main(String[] args) {

//        System.out.println("Hello World!");
//
//        Workbook f1Wb = WorkbookLoader.openF1Workbook();
//
//        PoiDemo.printSheetNames(f1Wb);
//        PoiDemo.printCellsFromSheet(f1Wb.getSheetAt(0));
//        PoiDemo.computePointsForARace(f1Wb.getSheetAt(0)); 
    	

        Workbook sudokuWb = WorkbookLoader.openSudokuWorkbook();
        SudokuBoardChecker sudoku = new SudokuBoardChecker(sudokuWb);
        
        System.out.println(sudoku.verifyBoard(5));
        
//        for (int sheetNumber = 0; sheetNumber < sudokuWb.getNumberOfSheets(); sheetNumber++) {
////        	System.out.println(sudoku.verifyBoardStructure(i));
//        	if(sudoku.verifyBoardStructure(sheetNumber)) {
//        		sudoku.verifyBoard(sheetNumber);
//        	}
//        }
//        for (int i = 0; i < sudokuWb.getNumberOfSheets(); i++) {
//        	System.out.println(sudoku.verifyBoard(i));
//        }
        

    }
}
