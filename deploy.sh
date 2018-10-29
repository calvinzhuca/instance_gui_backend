mvn clean package
rm -rf /home/czhu/jboss/BPMS/rhpam-7.0.0.GA/rhpam-businessCentral_71/standalone/deployments/backend.*
cp //home/czhu/works/git/bpms7_git/calvin_fork/instance_gui_backend/target/backend.war /home/czhu/jboss/BPMS/rhpam-7.0.0.GA/rhpam-businessCentral_71/standalone/deployments/
touch /home/czhu/jboss/BPMS/rhpam-7.0.0.GA/rhpam-businessCentral_71/standalone/deployments/backend.war.dodeploy
ls -l /home/czhu/jboss/BPMS/rhpam-7.0.0.GA/rhpam-businessCentral_71/standalone/deployments/

