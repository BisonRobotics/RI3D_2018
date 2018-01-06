#include "Gyroscope.h"
#include "../RobotMap.h"

Gyroscope::Gyroscope() : Subsystem("Gyroscope") {
	gyroz = RobotMap::gyroscopeGyroscope;
}

void Gyroscope::InitDefaultCommand(void) {
	return;
}
