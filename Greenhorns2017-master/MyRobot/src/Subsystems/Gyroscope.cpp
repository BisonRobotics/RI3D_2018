#include "Gyroscope.h"
#include "../RobotMap.h"

Gyroscope::Gyroscope() : Subsystem("Gyroscope") {
	gyroz = RobotMap::gyroscopeADXRS450;
	gyrox = RobotMap::gyroscopeNavX;
}

void Gyroscope::InitDefaultCommand(void) {
	return;
}
