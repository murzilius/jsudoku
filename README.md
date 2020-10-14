#1
We have PC with Win10 to deploy Virtual machine using Vagrant and notebook with Ubuntu to make some other stuff
First of all we install Vagrant Virtual Machine with Debian 9
Use "vagrant init debian/stretch64"
Make some changes in vagrant file:
config.vm.network "public_network" - to provide bridge network to VM
vb.memory = "2048" - more RAM is always better than less :)
Make some provision and startup configuration
config.vm.provision "shell", inline: <<-SHELL
     sudo timedatectl set-timezone Europe/Minsk
	 apt-get update
	 apt-get upgrade
     apt-get install -y ansible
   SHELL
Start VM - vagrant up
VM assign IP 10.6.5.109
#1a 
Install ansible on notebook with "apt-get install ansible"
add string "10.6.5.109 ansible_ssh_private_key_file=/home/murzilius/.ssh/private_key" to /etc/ansible/hosts
to have access to VM host by ansible
add string "remote_user = vagrant" to /etc/ansible/ansible.cfg" to make user vagrant default
Create ansible playbook test.yml that provide following:
	Install MC (becouse i realy like it)
	Install JAVA Runtime Environment	
	Install JAVA Development Kit
	Install apt-transport-https
	Add repository https://pkg.jenkins.io/debian-stable/jenkins.io.key
	Create file /etc/apt/sources.list.d/jenkins.list with string 'deb https://pkg.jenkins.io/debian-stable binary/'
	Install Jenkins
	Install Git
	Install Maven
#2
To continue task we use Jsudoku source code
#3
We create Git repository and init it on notebook using "git clone https://murzilius/jsudoku"
Create Maven Project using
"mvn archetype:generate -DgroupId=murzilius -DartifactId=jsudoku -DarchetypeArtifactId=maven-archetype-simple -DarchetypeVersion=1.4 -DinteractiveMode=false"
Put source code into Maven project "~/jsudoku/src/main/java/murzilius/"
Update Git repository using
	git add -A
	git commit -m Maven ready
	git push




