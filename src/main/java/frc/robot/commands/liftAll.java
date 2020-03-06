/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

/*package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.lift;

public class liftAll extends Command {
    @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
    private final lift m_lift;

    public liftAll(lift subsytem) {
        m_lift = subsytem;
        addRequirements(Robot.liftAll);
    }


    private void addRequirements(Command liftAll) {
    }

    @Override
    protected void execute() {
        m_lift.liftUp();
    }
    @Override
    protected boolean isFinished() {

        return true;
    }

    @Override
    protected void end() {
        m_lift.liftUp();
    }

    @Override
    protected void interrupted() {
        end();
    }

    }
    */