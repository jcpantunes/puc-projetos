<%@ Page Title="Contact" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Monitor.aspx.cs" Inherits="WebApplication.Monitor" %>

<asp:Content runat="server" ID="BodyContent" ContentPlaceHolderID="MainContent">
    <hgroup class="title">
        <h1>Monitor</h1>
    </hgroup>

    <asp:Panel ID="Panel1" runat="server">
    </asp:Panel>

    <section class="contact">
        <header>
            <h3>&nbsp;&nbsp;
                <asp:Label ID="lblMensagem" runat="server" Font-Bold="True" ForeColor="Red"></asp:Label>
            </h3>
            <p>
                &nbsp;&nbsp;
                &nbsp;
                &nbsp;
                </p>
            <div>
            <asp:Panel ID="Panel3" runat="server" Width="990px" BorderColor="Black" BorderStyle="Solid" BorderWidth="1px">
                <asp:Button ID="btnIniciarMonitor" runat="server" Height="38px" OnClick="btnIniciarMonitor_Click" Text="Iniciar Monitor" Width="147px" />
                <asp:Button ID="btnPararMonitor" runat="server" Height="38px" OnClick="btnPararMonitor_Click" Text="Parar Monitor" Width="138px" />
                <asp:Button ID="btnListarLog" runat="server" Text="Listar Log" Width="113px" OnClick="btnListarLog_Click" />
                <br />
                &nbsp;<asp:GridView ID="gridLog" runat="server" CellPadding="4" ForeColor="#333333" GridLines="None" Width="945px">
                    <AlternatingRowStyle BackColor="White" />
                    <EditRowStyle BackColor="#2461BF" />
                    <FooterStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                    <HeaderStyle BackColor="#507CD1" Font-Bold="True" ForeColor="White" />
                    <PagerStyle BackColor="#2461BF" ForeColor="White" HorizontalAlign="Center" />
                    <RowStyle BackColor="#EFF3FB" />
                    <SelectedRowStyle BackColor="#D1DDF1" Font-Bold="True" ForeColor="#333333" />
                    <SortedAscendingCellStyle BackColor="#F5F7FB" />
                    <SortedAscendingHeaderStyle BackColor="#6D95E1" />
                    <SortedDescendingCellStyle BackColor="#E9EBEF" />
                    <SortedDescendingHeaderStyle BackColor="#4870BE" />
                </asp:GridView>
                <br />
                <br />
            </asp:Panel>
            <p>
                <asp:Localize ID="Localize1" runat="server"></asp:Localize>
                </p>
            </div>
            <p>&nbsp;</p>
        </header>
    </section>
</asp:Content>