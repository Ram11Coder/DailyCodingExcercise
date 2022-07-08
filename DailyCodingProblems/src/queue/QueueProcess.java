package queue;
/**
 *  There is a circular queue of processes. Every time there will be certain no of process skipped and a particular start position. Find the safe position.
Input: Number of process:5
       Start position:3
       Skip: 2nd
Output: 1 will be the safest position
(Logic: 1 2 3 4 5 starting from 3, 5th process will be skipped
        1 2 3 4 5 process 2 will be skipped
        1 2 3 4 5 process 4 will be skipped
        1 2 3 4 5 process 3 will be skipped, so safest process is 1.
 *
 */
public class QueueProcess {

}
