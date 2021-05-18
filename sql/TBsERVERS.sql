/* brModelo: */

CREATE TABLE tbServers (
    idServer INTEGER PRIMARY KEY auto_increment,
    SubscriptionName Varchar(30),
    SubscriptionID varchar(40),
    VmName varchar(40),
    ResourceGroupName varchar(50),
    Region varchar(40),
    Size varchar(40),
    VirturalNetwork varchar(40),
    Subnet varchar(40),
    PrivateIpAddress varchar(40),
    OsType varchar(40),
    PowerState varchar(40),
    LicenseType varchar(40),
    OS_Disk_Size varchar(50),
    OS_Disk_Sku varchar(50),
    Data_Disks_Sizes varchar(50),
    Data_Disks_Skus varchar(50),
    Nic_Name varchar(50),
    PublicIPAddress varchar(50),
    AvailabilitySet varchar(50),
    ApplicationSecurityGroup varchar(50)
);