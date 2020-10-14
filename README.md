Full version of the task with screenshots and more explanation should be find [here](https://www.dropbox.com/scl/fi/7fxg1qb4n5nrz263xccdg/Epam-Milestones.docx?dl=0&rlkey=8a53tduhj9bxftalpgvq1pssl)  (in russian) 

### 1. Working with Vagrant & Ansible  
I have PC with Win10 to deploy Virtual machine using Vagrant and notebook with Ubuntu to make some other stuff.  
First of all I have to install Vagrant Virtual Machine with Debian 9  
I use `vagrant init debian/stretch64`  
Make some changes in vagrant file:  
`config.vm.network public_network` - to provide bridge network to VM  
`vb.memory = "2048"` - more RAM is always better than less :)  
Make some provision and startup configuration  
`config.vm.provision "shell", inline: <<-SHELL`  
`sudo timedatectl set-timezone Europe/Minsk`  
`apt-get update`  
`apt-get upgrade`  
`apt-get install -y ansible`  
`SHELL`  
Start VM - `vagrant up`  
Debian virtual machine assigning IP 10.6.5.109  
#### 1a   
Than I have to install ansible on notebook with `apt-get install ansible`  
I add string `10.6.5.109 ansible_ssh_private_key_file=/home/murzilius/.ssh/private_key` to "/etc/ansible/hosts"  
to have access to VM host by ansible  
I add string `remote_user = vagrant` to "/etc/ansible/ansible.cfg" to make user "vagrant" default  
After that I create ansible playbook "test.yml" that provide following:  
* Install MC (becouse i realy like it)  
* Install JAVA Runtime Environment  
* Install JAVA Development Kit  
* Install apt-transport-https  
* Add repository https://pkg.jenkins.io/debian-stable/jenkins.io.key  
* Create file /etc/apt/sources.list.d/jenkins.list with string `deb https://pkg.jenkins.io/debian/-stable binary/'  
* Install Jenkins  
* Install Git  
* Install Maven  
### 2. Source code  
To continue task I use Jsudoku source code 
### 3. Creating Git Repository  
I have to create Git repository and init it on notebook using `git clone https://murzilius/jsudoku`  
Than I create Maven Project using  
`mvn archetype:generate -DgroupId=murzilius -DartifactId=jsudoku -DarchetypeArtifactId=maven-archetype-simple -DarchetypeVersion=1.4 -DinteractiveMode=false"`  
I put source code into Maven project "~/jsudoku/src/main/java/murzilius/"  
Update Git repository using  
`git add -A`  
`git commit -m Maven ready`  
`git push` 
### 4. Prepareing build with Maven
As I mention in chapter 3 for preapareing project I choose Maven.
For configurating Maven I must use "pom.xml" file in the root directory of the project instead of "build.xml"
I configurate `maven-jar-plugin` to mark Java Main Class of Jsudoku
`<manifest>`  
`<addClasspath>true</addClasspath>`  
`<mainClass>oyg.sudoku.CreateSudokuGUI</mainClass>`  
`</manifest>`  
Than I check if it's all right with bulding project in Maven  
`mvn package`  
And syncronize project with Git
### 5. Configurating & Working with Jenkins
First of all I create Item in Jenkins as item\`s type I chhose "Free configuration task"
Here is the main settings of the task:
* Project url - https://github.com/murzilius/jsudoku/  
* Repository URL - https://github.com/murzilius/jsudoku/  
* Git Credentials – Git username\password  
* Branches to build - \*/main  
* Shedule task - H/15 22 * * 3 (it means that task will be execute every 15 min.)
* Maven target - package
### 6.Adding code test to build
I decided to use PMD for code testing. I use Maven plugin `maven-pmd-plugin` for this prupose
Let\'s pom.xml modify file to configure plugin  
`<artifactId>maven-pmd-plugin</artifactId>`  
`<version>2.7.1</version>`  
`<configuration>`  
`<linkXRef>false</linkXRef>`  
`<targetJdk>1.6</targetJdk>`  
`<rulesets>`  
`<ruleset>/rulesets/basic.xml</ruleset>`  
`</rulesets>`  
`</configuration>`  
`</plugin>`  
As a result code have pased test that defined in basic.xml file
The task is over thanks for attention.













