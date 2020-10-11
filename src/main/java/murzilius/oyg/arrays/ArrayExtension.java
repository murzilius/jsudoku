package oyg.arrays;
/**
 *This package is designed to extend Arrays handling<br>
 *No smart code - just simple one
 * @AUTHOR: Oren Yagev
 * @version 0.1
 */
import java.util.*;
import java.lang.*;
import oyg.exceptions.*;
import java.math.*;

public class ArrayExtension {
	
	/**
	 * This method returns small array derived from a bigger one.
	 * @param arr - the array to use
	 * @param fromIndex - integer describing the first index to take
	 * @param toIndex - integer describing the last index to take
	 * @return - new derived array returned
	 */
	public static int[] PartOfArray(int[] arr,int fromIndex,int toIndex){
		
	
		if (fromIndex>toIndex){
			int[] temp = {0};
			return temp;
		}
		int[] temp = new int[toIndex-fromIndex+1];
		int i,j;
		for (i=fromIndex,j=0;i<=toIndex;i++,j++){
			temp[j]=arr[i];
		}
		return temp;
	}
	/**
	 * This method returns small array derived from a bigger one.
	 * @param arr - the array to use
	 * @param fromIndex - integer describing the first index to take
	 * @param toIndex - integer describing the last index to take
	 * @return - new derived array returned
	 */
	public static float[] PartOfArray(float[] arr,int fromIndex,int toIndex){
		
		
		if (fromIndex>toIndex){
			float[] temp = {0};
			return temp;
		}
		float[] temp = new float[toIndex-fromIndex+1];
		int i,j;
		for (i=fromIndex,j=0;i<=toIndex;i++,j++){
			temp[j]=arr[i];
		}
		return temp;
	}
	/**
	 * This method returns small array derived from a bigger one.
	 * @param arr - the array to use
	 * @param fromIndex - integer describing the first index to take
	 * @param toIndex - integer describing the last index to take
	 * @return - new derived array returned
	 */
	public static double[] PartOfArray(double[] arr,int fromIndex,int toIndex){
		
		
		if (fromIndex>toIndex){
			double[] temp = {0};
			return temp;
		}
		double[] temp = new double[toIndex-fromIndex+1];
		int i,j;
		for (i=fromIndex,j=0;i<=toIndex;i++,j++){
			temp[j]=arr[i];
		}
		return temp;
	}

	public static int[] TakeRowFromArray(int[][] arr,int index){
		return arr[index];
	}
	public static int[] TakeColumnFromArray(int[][] arr, int index) throws exArrayOutOfRange{
		int horzLength = arr[0].length;
		int[] temp = new int[horzLength];
		int i=0;
		if (index>=horzLength){
			throw new exArrayOutOfRange();
		}
		for (i=0;i<horzLength;i++){
			temp[i]=arr[i][index];
		}
		return temp;
		
	}

	public static int[][] PartOfArray(int[][] arr,int vert1,int horz1,int vert2,int horz2) 
				throws exArrayOutOfRange{
		int vertLength = arr.length;
		int horzLength = arr[0].length;
		if ((vert1>vertLength)||(vert2>vertLength)||
			(horz1>horzLength)||(horz2>horzLength)||
			(vert1>vert2)||(horz1>horz2)){
			
			throw new exArrayOutOfRange();
		}
		int temp[][] = new int[vert2-vert1+1][horz2-horz1+1];
		int i=vert1;
		int j=0;
		for (i=vert1,j=0;i<=vert2;i++,j++){
			temp[j]=PartOfArray(arr[i],horz1,horz2);
		}
		return temp;
		
		
		
		
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static int[] Clone(int[] arr){
		int[] tempArr = new int[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static float[] Clone(float[] arr){
		float[] tempArr = new float[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static double[] Clone(double[] arr){
		double[] tempArr = new double[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static long[] Clone(long[] arr){
		long[] tempArr = new long[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static byte[] Clone(byte[] arr){
		byte[] tempArr = new byte[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static boolean[] Clone(boolean[] arr){
		boolean[] tempArr = new boolean[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static String[] Clone(String[] arr){
		String[] tempArr = new String[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static Object[] Clone(Object[] arr){
		Object[] tempArr = new Object[arr.length];
		System.arraycopy(arr,0,tempArr,0,arr.length);
		return tempArr;
	}
	/**
	 * This method returns a new replica of an array.
	 * The purpose is to use the new array withput changing the old one.
	 * Used to pass an array and not a link to the old array.
	 * @param arr - the array to use reproduce
	 * @return - replica array returned
	 */
	public static int[][] Clone(int[][] arr){
		int i;
		int[][] tempArr = new int[arr.length][arr[0].length];
		for (i=0;i<arr.length;i++){
			System.arraycopy(arr[i],0,tempArr[i],0,arr[0].length);
		}
		return tempArr;
	}
	/**
         *this method return random integer from an array
         */
        public static int selectRandomNum(int[] arr){
            int size = arr.length;
            double tempnum = Math.random()*size;
            int randomIndex = (int)Math.floor(tempnum);
            
            if (randomIndex>=arr.length){
                randomIndex = arr.length-1;
            }
            return arr[randomIndex];
        }
        /**
         *returns integers from A that are not in B
         */
        public static int[] getNumbersNotInArray(int[] A, int[] B){
            int i=0,j=0,counter = 0;
            int[] resultList = new int[A.length];
            boolean found =false;
            for (i=0;i<A.length;i++){
                j=0;
                while ((j<B.length) && !found){
                    if (A[i]==B[j]){
                        found = true;
                    }
                    j++;
                    
                }
                if (!found){
                    resultList[counter]=A[i];
                    counter++;                    
                }
                else{
                    found = false;
                }
                    
            }
            i=0;
            while(i<resultList.length && resultList[i]>0){
                i++;
            }
            int[] res = new int[i];
            i=0;
            while(i<res.length){
                res[i]=resultList[i];
                i++;
            }
            return res;
        }
        
}

