/**
 * * ******************************************************************************
 *   Copyright (c) 2015 Sandeep Kumar.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  *****************************************************************************
 */

/**
 * @author Sandeep Kumar
 *
 * This is abstract base class for all cars, every car must have the properties of this class, 
 * In other words every car should have ownerName and accelerate(), applyBreak(), changeGearToUp()
 * functionality.
 * otherwise that is not a car. This is called Abstraction feature of OOP
 */
public abstract class Car {
	
	private String ownerName;
	
	//setOwnerName( String owner) and getOwnerName() methods hides data from outside world.
	//That means outside world can only access the owner name with these methods.
	//This is called Encapsulation feature of OOP
	public void setOwnerName( String owner) {
		ownerName = owner;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	// We use same method name for these methods. accelerate(), accelerate(boolean reverse)
	//This is called polymorphism feature of OOP
	public abstract void accelerate();
	public abstract void accelerate(boolean reverse);
	
	public abstract void applyBreak();
	public abstract void changeGearToUp();

}

