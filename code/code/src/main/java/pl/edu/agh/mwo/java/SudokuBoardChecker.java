package pl.edu.agh.mwo.java;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class SudokuBoardChecker {
	
	Workbook m_workbook;
	
	public SudokuBoardChecker(Workbook workbook) {
	System.out.println("SudokuBoardChecker:");
	m_workbook = workbook;
	}
	
	public boolean verifyBoardStructure(int sheetIndex) {
		boolean result = true; 
		Sheet sheet = m_workbook.getSheetAt(sheetIndex);
        for (Row row : sheet) {
            for (Cell cell : row) {
            		if (cell.getCellType() == CellType.BLANK) {
            			continue;
            		}
            		if (cell.getCellType() == CellType.STRING) {
            			return false;
            		}
            		if (cell.getCellType() != CellType.NUMERIC) {
            			result = false;
            		}
            		if ((cell.getNumericCellValue() < 1 || cell.getNumericCellValue() > 9)) {
            			result = false;
            		}
            }			
        }
		return result;
	}
	
	public static void printCellsFromSheet(Sheet sheet){
        System.out.println(String.format("The content of %s sheets:", sheet.getSheetName()));

        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.getNumericCellValue() + " ");
            }
            System.out.println();
        }
    }
	
	public boolean verifyBoard(int sheetIndex) {
		Sheet sheet = m_workbook.getSheetAt(sheetIndex);
		System.out.println("\nSheet number" + sheetIndex);
		
		double cellRowStoredValue = 0;
		for (int rowNumber = 0; rowNumber < 8; rowNumber++) {
			Row row = sheet.getRow(rowNumber);
			for (int cellNumber = 0; cellNumber < 8; cellNumber++){
				Cell cell = row.getCell(cellNumber);
				cellRowStoredValue = cell.getNumericCellValue();
				if (cellRowStoredValue == 0.0) {
					continue;
				}
				for (int cellNumberInner = cellNumber + 1; cellNumberInner < 9; cellNumberInner++) {
					Cell cellInner = row.getCell(cellNumberInner);
					double cellRowCurrentValue = cellInner.getNumericCellValue();
					if(cellRowStoredValue == cellRowCurrentValue) {
//						System.out.print("test");
						return false;
					}
				}
			}
		}
		return true;
	}

}
