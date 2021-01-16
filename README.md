# Book Recursion

Your program consume the following Json data as an input.

Please parse the data and print the title of each chapters as shown in the output below

### Sample Input

input = [
{"id": 1, "name": "US History", "parent_id": None},
{"id": 2, "name": "Third Assignment", "parent_id": 3},
{"id": 3, "name": "First Chapter", "parent_id": 1},
{"id": 4, "name": "Second Assignment", "parent_id": 1},
{"id": 5, "name": "First Assignment", "parent_id": 6},
{"id": 6, "name": "Canadian History", "parent_id": None},
]
<br>
### Output:
US History<br>
-First Chapter<br>
--Third Assignment<br>
-Second Assignment<br>
Canadian History<br>
-First Assignment<br>

### Author

Ramkumar Velmurugan

### License
    Copyright 2021 Ramkumar Velmurugan

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
