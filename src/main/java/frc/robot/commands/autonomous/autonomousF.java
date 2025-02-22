/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import com.kauailabs.navx.frc.AHRS;

public class autonomousF extends TimedRobot {
    Command autonomousF;

    private double startTime;
    public static void start(){

    }
    
    
    @Override
    public void autonomousInit() {
        RobotMap.ahrs.getYaw();
    }

    @Override
    public void autonomousPeriodic() { 
        startTime = Timer.getFPGATimestamp();

        double time = Timer.getFPGATimestamp();

        if (time - startTime < 5) {
            RobotMap.driveTrainLeftMotorA.set(0.6);
            RobotMap.driveTrainLeftMotorB.set(0.6);
            RobotMap.driveTrainRightMotorA.set(-0.6);
            RobotMap.driveTrainRightMotorB.set(-0.6);
        } else {
            RobotMap.driveTrainLeftMotorA.set(0);
            RobotMap.driveTrainLeftMotorB.set(0);
            RobotMap.driveTrainRightMotorA.set(0);
            RobotMap.driveTrainRightMotorB.set(0);
        
    }
}

	public void cancel() {
	}

}


