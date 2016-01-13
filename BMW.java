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
  * The keyword extends use to derive from base class, This is called Inheritance feature of OOP
 */
public class BMW extends Car {

	@Override
	public void accelerate() {
		System.out.println("BMW accelerating");
	}
	
	@Override
	public void accelerate(boolean reverse) {
		System.out.println("BMW accelerating on reverse gear");
	}

	@Override
	public void applyBreak() {
		System.out.println("BMW applying break");
	}

	@Override
	public void changeGearToUp() {
		System.out.println("BMW change gear up");
	}
	
	public void abs() {
		System.out.println("BMW Applying ABS");
	}

	
	
}

