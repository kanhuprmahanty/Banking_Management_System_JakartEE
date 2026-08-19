package service;

import entity.Attendance;

public class AttendanceService {

    public void markAttendance(
            Attendance attendance){

        attendance.setStatus(
                "PRESENT");
    }
}