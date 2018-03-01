package ArraysAndString;

import java.util.Arrays;

public class MeetingOverlap {

	private static Boolean[] meetingCalendar = new Boolean[100];
	
	private static int roomCounter = 0;

	public static void main(String[] args) {
		
		int[][] plan= {{1,2}, {2,5}, {3,5}};
		
		int[] starttime = {1,5,8,2};
		int[] endtime = {4,6,9,6};
		overlap(starttime,endtime);
		
		//Arrays.fill(meetingCalendar, false);

		//meetingoverlap(plan);

		//System.out.println("Number of rooms required " + (roomCounter + 1));
	}

	private static void overlap(int[] starttime, int[] endtime) {
		int rooms = 0, max = 0;
		Arrays.sort(starttime);
		Arrays.sort(endtime);
		
		int i=0,j=0;
		while(i<starttime.length && j<endtime.length){
			if(starttime[i]<endtime[j]){
				rooms = rooms+1;
				i++;
			}
			else
			{
				rooms=rooms-1;
				j++;
			}
			if(rooms>max)
				max = rooms;
		}
		System.out.println("rooms: "+max);
	}

	private static void meetingoverlap(int[][] dailyPlan) {
		
		for(int i=0; i<dailyPlan.length; i++)
		{
			setAndCheckCalendar(dailyPlan[i][0], dailyPlan[i][1]);
		}
	}

	private static void setAndCheckCalendar(int start, int end)
	{
		System.out.println("start : " + start + " , "  + "end : " + end);
		for(int i=start; i<end; i++)
		{
			if(meetingCalendar[i] == true)
			{
				roomCounter++;
				break;
			}
			else
			{
				meetingCalendar[i] = true;
			}
		}
	}
}
