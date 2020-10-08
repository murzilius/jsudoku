package oyg.sudoku;
import oyg.arrays.ArrayExtension;
import oyg.exceptions.*;

public class Soduko {
	private final int SODUKO_SIZE = 9;
	
	//the soduko board as array
	private int[][] SodukoBoard = new int [SODUKO_SIZE][SODUKO_SIZE];
	//initialize the board with 0
	public Soduko(){
		int i=0;
		int j=0;
		for (i=0;i<(SODUKO_SIZE-1);i++){
			for (j=0;j<(SODUKO_SIZE-1);j++){
				SodukoBoard[i][j]=0;
			}
			
		}
	}
	//initialize the board with an array	
	public Soduko(int[][] arr){
		if (arr.length==SODUKO_SIZE && arr[0].length==SODUKO_SIZE){
			SodukoBoard=arr;
		}
		else{
			int i=0;
			int j=0;
			for (i=0;i<(SODUKO_SIZE-1);i++){
				for (j=0;j<(SODUKO_SIZE-1);j++){
					SodukoBoard[i][j]=0;
				}
				
			}
		}
	}
	//Add one number to the board
	public void AddToBoard(int num,int VertPos,int HorzPoz) throws exArrayOutOfRange{
		if ((VertPos<SODUKO_SIZE)&&(HorzPoz<SODUKO_SIZE)){
			SodukoBoard[VertPos][HorzPoz]=num;
		}
		else{
			throw new exArrayOutOfRange();
		}
		
		
	}
	// return the board
	public int[][] StateBoard(){
		return SodukoBoard;
	}
	
	public boolean CheckSodukoBoard(){
		boolean result = true;
		int i=0,j=0;
//		check rows:
		for (i=0;i<SODUKO_SIZE;i++){
			SodukoObject so = new SodukoObject
				(ArrayExtension.TakeRowFromArray(SodukoBoard,i));
			result = so.CheckSodukoObject();
			if (!result){
				return result;
			}
		}
//		check columns:
		for (i=0;i<SODUKO_SIZE;i++){
			try{
				int[] column = ArrayExtension.TakeColumnFromArray(SodukoBoard,i);
				SodukoObject so = new SodukoObject(column);
				result = so.CheckSodukoObject();
				if (!result){
					return result;
				}
			}
			catch (exArrayOutOfRange e){};			
		}	
		//check rectangle:
		try{
			for (i=0;i<=(SODUKO_SIZE-3);i+=3){
				for (j=0;j<=(SODUKO_SIZE-3);j+=3){
					SodukoObject so = new SodukoObject
						(ArrayExtension.PartOfArray(SodukoBoard,i,j,i+2,j+2));
					result = so.CheckSodukoObject();
					if (!result){
						return result;
					}
				}
			}
		}
		catch (exArrayOutOfRange e){};
		return result;
	}
        
        public void SodukoBuild(int level){
            final int[] basicRow = {1,2,3,4,5,6,7,8,9};
            int[] randomFirstRow = new int[9];
            int i=0,j=0;
            int[] basicFirstRow =  (int[])basicRow.clone();
            //create first random row...
            for (i=0;i<randomFirstRow.length;i++){
                randomFirstRow[i] = ArrayExtension.selectRandomNum(basicFirstRow);
                basicFirstRow = ArrayExtension.getNumbersNotInArray(basicFirstRow, randomFirstRow);
            }
            //this is the main loop to create the board
            for (i=0;i<3;i++){
                int[] triple1 = {randomFirstRow[0],randomFirstRow[1],randomFirstRow[2]};
                int[] triple2 = {randomFirstRow[3],randomFirstRow[4],randomFirstRow[5]};
                int[] triple3 = {randomFirstRow[6],randomFirstRow[7],randomFirstRow[8]};
                //set first row in block of 3 rows:
                for (j=0;j<SODUKO_SIZE;j++){
                    SodukoBoard[i*3][j]=randomFirstRow[j];
                }
                for (j=0;j<3;j++){
                    SodukoBoard[i*3+1][j]=triple2[j];
                    SodukoBoard[i*3+1][j+3]=triple3[j];
                    SodukoBoard[i*3+1][j+6]=triple1[j];
                    SodukoBoard[i*3+2][j]=triple3[j];
                    SodukoBoard[i*3+2][j+3]=triple1[j];
                    SodukoBoard[i*3+2][j+6]=triple2[j];
                }
                if (i<2){
                    randomFirstRow = createRandomFirstRow((i+1)*3);
                }
            }
            if (this.CheckSodukoBoard()){
                SodukoBoard = createSodukoPuzzle(level);
            }
            else {
                this.SodukoBuild(level);
            }
        }
        
        
        
        private int[] createRandomFirstRow(int rowNum){
            int[] row,column,tempArr;
            int[] basicRow = {1,2,3,4,5,6,7,8,9};
            int[] result = new int[9];
            int i=0;
            for (i=0;i<9;i++){
                try{
                    row = ArrayExtension.TakeRowFromArray(SodukoBoard, rowNum);
                    column = ArrayExtension.TakeColumnFromArray(SodukoBoard,i);
                    tempArr = ArrayExtension.getNumbersNotInArray(basicRow, row);
                    tempArr = ArrayExtension.getNumbersNotInArray(tempArr, column);
                    tempArr = ArrayExtension.getNumbersNotInArray(tempArr, result);
                    if (tempArr.length<1){
                        return createRandomFirstRow(rowNum);
                        //System.out.println("this is wrong!");
                    }
                    result[i] = ArrayExtension.selectRandomNum(tempArr);
                    
                }
                catch(exArrayOutOfRange e){}
                
            }
            return result;
            
        }
        private int[][] createSodukoPuzzle(int level){
            int[][] tempArr = new int[SODUKO_SIZE][SODUKO_SIZE];
            int i=1,vertIndex,horzIndex;
            int counter1=0,counter2=0;
            for (counter1=0;i<=level;counter1+=3){
                if (counter1==9){counter1=0;}
                for (i=i,counter2=0;i<=level && counter2<9;i++,counter2+=3){         
                    
                    vertIndex = (int)(Math.floor(Math.random()*3));
                    horzIndex = (int)(Math.floor(Math.random()*3));
                    tempArr[vertIndex+counter1][horzIndex+counter2] = 
                            SodukoBoard[vertIndex+counter1][horzIndex+counter2];
                }
            }
            return tempArr;
        }
}


