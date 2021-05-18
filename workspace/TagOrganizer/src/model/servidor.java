package model;

public class servidor {

	public String SubscriptionName;
	public String SubscriptionID;
	public String VmName;
	public String ResourceGroupName;
	public String Region;
	public String Size;
	public String VirturalNetwork;
	public String Subnet;
	public String PrivateIpAddress;
	public String OsType;
	public String PowerState;
	public String LicenseType;
	public String OS_Disk_Size;
	public String OS_Disk_Sku;
	public String Data_Disks_Sizes;
	public String Data_Disks_Skus;
	public String Nic_Name;
	public String PublicIPAddress;
	public String AvailabilitySet;
	public String ApplicationSecurityGroup;
	public String getSubscriptionName() {
		return SubscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		SubscriptionName = subscriptionName;
	}
	public String getSubscriptionID() {
		return SubscriptionID;
	}
	public void setSubscriptionID(String subscriptionID) {
		SubscriptionID = subscriptionID;
	}
	public String getVmName() {
		return VmName;
	}
	public void setVmName(String vmName) {
		VmName = vmName;
	}
	public String getResourceGroupName() {
		return ResourceGroupName;
	}
	public void setResourceGroupName(String resourceGroupName) {
		ResourceGroupName = resourceGroupName;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public String getVirturalNetwork() {
		return VirturalNetwork;
	}
	public void setVirturalNetwork(String virturalNetwork) {
		VirturalNetwork = virturalNetwork;
	}
	public String getSubnet() {
		return Subnet;
	}
	public void setSubnet(String subnet) {
		Subnet = subnet;
	}
	public String getPrivateIpAddress() {
		return PrivateIpAddress;
	}
	public void setPrivateIpAddress(String privateIpAddress) {
		PrivateIpAddress = privateIpAddress;
	}
	public String getOsType() {
		return OsType;
	}
	public void setOsType(String osType) {
		OsType = osType;
	}
	public String getPowerState() {
		return PowerState;
	}
	public void setPowerState(String powerState) {
		PowerState = powerState;
	}
	public String getLicenseType() {
		return LicenseType;
	}
	public void setLicenseType(String licenseType) {
		LicenseType = licenseType;
	}
	public String getOS_Disk_Size() {
		return OS_Disk_Size;
	}
	public void setOS_Disk_Size(String oS_Disk_Size) {
		OS_Disk_Size = oS_Disk_Size;
	}
	public String getOS_Disk_Sku() {
		return OS_Disk_Sku;
	}
	public void setOS_Disk_Sku(String oS_Disk_Sku) {
		OS_Disk_Sku = oS_Disk_Sku;
	}
	public String getData_Disks_Sizes() {
		return Data_Disks_Sizes;
	}
	public void setData_Disks_Sizes(String data_Disks_Sizes) {
		Data_Disks_Sizes = data_Disks_Sizes;
	}
	public String getData_Disks_Skus() {
		return Data_Disks_Skus;
	}
	public void setData_Disks_Skus(String data_Disks_Skus) {
		Data_Disks_Skus = data_Disks_Skus;
	}
	public String getNic_Name() {
		return Nic_Name;
	}
	public void setNic_Name(String nic_Name) {
		Nic_Name = nic_Name;
	}
	public String getPublicIPAddress() {
		return PublicIPAddress;
	}
	public void setPublicIPAddress(String publicIPAddress) {
		PublicIPAddress = publicIPAddress;
	}
	public String getAvailabilitySet() {
		return AvailabilitySet;
	}
	public void setAvailabilitySet(String availabilitySet) {
		AvailabilitySet = availabilitySet;
	}
	public String getApplicationSecurityGroup() {
		return ApplicationSecurityGroup;
	}
	public void setApplicationSecurityGroup(String applicationSecurityGroup) {
		ApplicationSecurityGroup = applicationSecurityGroup;
	}
	public servidor(String subscriptionName, String subscriptionID, String vmName, String resourceGroupName,
			String region, String size, String virturalNetwork, String subnet, String privateIpAddress, String osType,
			String powerState, String licenseType, String oS_Disk_Size, String oS_Disk_Sku, String data_Disks_Sizes,
			String data_Disks_Skus, String nic_Name, String publicIPAddress, String availabilitySet,
			String applicationSecurityGroup) {
		super();
		SubscriptionName = subscriptionName;
		SubscriptionID = subscriptionID;
		VmName = vmName;
		ResourceGroupName = resourceGroupName;
		Region = region;
		Size = size;
		VirturalNetwork = virturalNetwork;
		Subnet = subnet;
		PrivateIpAddress = privateIpAddress;
		OsType = osType;
		PowerState = powerState;
		LicenseType = licenseType;
		OS_Disk_Size = oS_Disk_Size;
		OS_Disk_Sku = oS_Disk_Sku;
		Data_Disks_Sizes = data_Disks_Sizes;
		Data_Disks_Skus = data_Disks_Skus;
		Nic_Name = nic_Name;
		PublicIPAddress = publicIPAddress;
		AvailabilitySet = availabilitySet;
		ApplicationSecurityGroup = applicationSecurityGroup;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ApplicationSecurityGroup == null) ? 0 : ApplicationSecurityGroup.hashCode());
		result = prime * result + ((AvailabilitySet == null) ? 0 : AvailabilitySet.hashCode());
		result = prime * result + ((Data_Disks_Sizes == null) ? 0 : Data_Disks_Sizes.hashCode());
		result = prime * result + ((Data_Disks_Skus == null) ? 0 : Data_Disks_Skus.hashCode());
		result = prime * result + ((LicenseType == null) ? 0 : LicenseType.hashCode());
		result = prime * result + ((Nic_Name == null) ? 0 : Nic_Name.hashCode());
		result = prime * result + ((OS_Disk_Size == null) ? 0 : OS_Disk_Size.hashCode());
		result = prime * result + ((OS_Disk_Sku == null) ? 0 : OS_Disk_Sku.hashCode());
		result = prime * result + ((OsType == null) ? 0 : OsType.hashCode());
		result = prime * result + ((PowerState == null) ? 0 : PowerState.hashCode());
		result = prime * result + ((PrivateIpAddress == null) ? 0 : PrivateIpAddress.hashCode());
		result = prime * result + ((PublicIPAddress == null) ? 0 : PublicIPAddress.hashCode());
		result = prime * result + ((Region == null) ? 0 : Region.hashCode());
		result = prime * result + ((ResourceGroupName == null) ? 0 : ResourceGroupName.hashCode());
		result = prime * result + ((Size == null) ? 0 : Size.hashCode());
		result = prime * result + ((Subnet == null) ? 0 : Subnet.hashCode());
		result = prime * result + ((SubscriptionID == null) ? 0 : SubscriptionID.hashCode());
		result = prime * result + ((SubscriptionName == null) ? 0 : SubscriptionName.hashCode());
		result = prime * result + ((VirturalNetwork == null) ? 0 : VirturalNetwork.hashCode());
		result = prime * result + ((VmName == null) ? 0 : VmName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		servidor other = (servidor) obj;
		if (ApplicationSecurityGroup == null) {
			if (other.ApplicationSecurityGroup != null)
				return false;
		} else if (!ApplicationSecurityGroup.equals(other.ApplicationSecurityGroup))
			return false;
		if (AvailabilitySet == null) {
			if (other.AvailabilitySet != null)
				return false;
		} else if (!AvailabilitySet.equals(other.AvailabilitySet))
			return false;
		if (Data_Disks_Sizes == null) {
			if (other.Data_Disks_Sizes != null)
				return false;
		} else if (!Data_Disks_Sizes.equals(other.Data_Disks_Sizes))
			return false;
		if (Data_Disks_Skus == null) {
			if (other.Data_Disks_Skus != null)
				return false;
		} else if (!Data_Disks_Skus.equals(other.Data_Disks_Skus))
			return false;
		if (LicenseType == null) {
			if (other.LicenseType != null)
				return false;
		} else if (!LicenseType.equals(other.LicenseType))
			return false;
		if (Nic_Name == null) {
			if (other.Nic_Name != null)
				return false;
		} else if (!Nic_Name.equals(other.Nic_Name))
			return false;
		if (OS_Disk_Size == null) {
			if (other.OS_Disk_Size != null)
				return false;
		} else if (!OS_Disk_Size.equals(other.OS_Disk_Size))
			return false;
		if (OS_Disk_Sku == null) {
			if (other.OS_Disk_Sku != null)
				return false;
		} else if (!OS_Disk_Sku.equals(other.OS_Disk_Sku))
			return false;
		if (OsType == null) {
			if (other.OsType != null)
				return false;
		} else if (!OsType.equals(other.OsType))
			return false;
		if (PowerState == null) {
			if (other.PowerState != null)
				return false;
		} else if (!PowerState.equals(other.PowerState))
			return false;
		if (PrivateIpAddress == null) {
			if (other.PrivateIpAddress != null)
				return false;
		} else if (!PrivateIpAddress.equals(other.PrivateIpAddress))
			return false;
		if (PublicIPAddress == null) {
			if (other.PublicIPAddress != null)
				return false;
		} else if (!PublicIPAddress.equals(other.PublicIPAddress))
			return false;
		if (Region == null) {
			if (other.Region != null)
				return false;
		} else if (!Region.equals(other.Region))
			return false;
		if (ResourceGroupName == null) {
			if (other.ResourceGroupName != null)
				return false;
		} else if (!ResourceGroupName.equals(other.ResourceGroupName))
			return false;
		if (Size == null) {
			if (other.Size != null)
				return false;
		} else if (!Size.equals(other.Size))
			return false;
		if (Subnet == null) {
			if (other.Subnet != null)
				return false;
		} else if (!Subnet.equals(other.Subnet))
			return false;
		if (SubscriptionID == null) {
			if (other.SubscriptionID != null)
				return false;
		} else if (!SubscriptionID.equals(other.SubscriptionID))
			return false;
		if (SubscriptionName == null) {
			if (other.SubscriptionName != null)
				return false;
		} else if (!SubscriptionName.equals(other.SubscriptionName))
			return false;
		if (VirturalNetwork == null) {
			if (other.VirturalNetwork != null)
				return false;
		} else if (!VirturalNetwork.equals(other.VirturalNetwork))
			return false;
		if (VmName == null) {
			if (other.VmName != null)
				return false;
		} else if (!VmName.equals(other.VmName))
			return false;
		return true;
	}
	
	
	
}
